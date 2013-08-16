/*
 *
 *     This program is free software; you can redistribute it and/or modify it
 *     under the terms of the GNU General Public License, Version 2 as published
 *     by the Free Software Foundation.
 *
 *     This program is distributed in the hope that it will be useful, but
 *     WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *     or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *     for more details.
 *
 *     You should have received a copy of the GNU General Public License along
 *     with this program; if not, write to the Free Software Foundation, Inc., 59
 *     Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 */

package at.sciencesoft.osgi;

import com.openexchange.osgi.ServiceRegistry;

/**
 *  A registry for services needed by mwOXAdminGUI servlet bundle
 * 
 *  @author <a href="mailto:peter.sauer@sciencesoft.at">Peter Sauer</a>
 */
public final class OXAdminGuiServletServiceRegistry {
    private static final ServiceRegistry REGISTRY = new ServiceRegistry();

    /**
     * Gets the service registry
     * 
     * @return The service registry
     */
    public static ServiceRegistry getServiceRegistry() {
        return REGISTRY;
    }

    /**
     * Initializes a new {@link mwOXAdminGuiServletServiceRegistry}
     */
    private OXAdminGuiServletServiceRegistry() {
        super();
    }
}
