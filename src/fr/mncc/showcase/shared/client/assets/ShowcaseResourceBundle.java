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

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ExternalTextResource;
import com.google.gwt.resources.client.ImageResource;

public interface ShowcaseResourceBundle extends ClientBundle {

    @Source("images/andrew-avatar.png") ImageResource andrewAvatar();

    @Source("images/ericf-avatar.png") ImageResource ericfAvatar();

    @Source("images/reid-avatar.png") ImageResource reidAvatar();

    @Source("images/tilo-avatar.png") ImageResource tiloAvatar();

    @Source("images/9069037713_1752f5daeb.jpg") ImageResource img1();

    @Source("images/9069585985_80da8db54f.jpg") ImageResource img2();

    @Source("images/9086701425_fda3024927.jpg") ImageResource img3();

    @Source("images/9121446012_c1640e42d0.jpg") ImageResource img4();

    @Source("images/8907351301_bd7460cffb.jpg") ImageResource img5();

    @Source("images/8915936174_8d54ec76c6.jpg") ImageResource img6();

    @Source("images/file-icons.png") ImageResource fileIcons();

    @Source("files/SIDEMENULICENSE.md") ExternalTextResource sideMenuLicense();

    @Source("files/SIDEMENUREADME.md") ExternalTextResource sideMenuReadme();

    @Source("files/LANDINGPAGELICENSE.md") ExternalTextResource landingPageLicense();

    @Source("files/LANDINGPAGEREADME.md") ExternalTextResource landingPageReadme();

    @Source("files/BLOGLICENSE.md") ExternalTextResource blogLicense();

    @Source("files/BLOGREADME.md") ExternalTextResource blogReadme();
}
