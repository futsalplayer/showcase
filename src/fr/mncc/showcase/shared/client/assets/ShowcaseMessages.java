/**
 * Copyright (c) 2015 MNCC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * @author http://www.mncc.fr
 */
package fr.mncc.showcase.shared.client.assets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.LocalizableResource;
import com.google.gwt.i18n.client.Messages;

/**
 * Application-wide messages
 * Extend Messages to create a collection of formatted messages that can accept parameters.
 * <p/>
 * Method Annotations
 *
 * @DefaultMessage(String message)
 * Specifies the message string to be used for the default locale for this method, with all of the options above.
 * If an @AlternateMessage annotation is present, this is the default text used when more specific forms do not
 * apply — for count messages in English, this would be the plural form instead of the singular form.
 * @AlternateMessage({String form, String message, ...})
 * Specifies the text for alternate forms of the message. The supplied array of strings must be in pairs, with the
 * first entry the name of an alternate form appropriate for the default locale, and the second being the message
 * to use for that form. See the Plural Forms and Select Forms examples below.
 * <p/>
 * Parameter Annotations
 * @Example(String example)
 * An example for this variable. Many translation tools will show this to the translator instead of the placeholder
 * — i.e., Hello {0} with @Example("John") will show as Hello John with "John" highlighted to indicate it should
 * not be translated.
 * @Optional Indicates that this parameter need not be present in all translations. If this annotation is not supplied, it is
 * a compile-time error if the translated string being compiled does not include the parameter.
 * @PluralCount Indicates that this parameter is used to select which form of text to use (ie, 1 widget vs. 2 widgets).
 * The argument annotated must be int, short, an array, or a list (in the latter cases the size of the list is used
 * as the count).
 */
@LocalizableResource.DefaultLocale("en")
public interface ShowcaseMessages extends Messages {

    public static final ShowcaseMessages INSTANCE = GWT.create(ShowcaseMessages.class);

    @DefaultMessage("Bonjour {0}!")
    public String helloWorld(String name);
}
