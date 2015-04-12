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
package fr.mncc.showcase.photogallery.client;

import com.google.gwt.core.client.EntryPoint;
import fr.mncc.minus.routes.client.Route;
import fr.mncc.minus.routes.client.Router;
import fr.mncc.showcase.shared.client.CustomRoute;
import fr.mncc.showcase.shared.client.assets.ShowcaseConstants;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class ModuleEntryPoint implements EntryPoint {

    /**
     * This is the entry point method.
     */
    @Override
    public void onModuleLoad() {

        // Launch router
        Router router = new Router();

        // Declare new routes
        Route routePhotoGallery =
            new CustomRoute(ShowcaseConstants.INSTANCE.photoGalleryToken(),
                new PhotoGallery());

        // On routing failure redirect user to #!/home
        router.setFallback(routePhotoGallery);

        // Register a few routes
        router.add(routePhotoGallery);

        // Listen to History change events
        router.listen();

        // Try to redirect user to the current url address
        // On failure, redirect user to #!/photogallery
        router.loadFromBookmark("!/" + ShowcaseConstants.INSTANCE.photoGalleryToken());
    }
}
