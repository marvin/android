/**
 * ownCloud Android client application
 *
 * @author David González Verdugo
 * @author Abel García de Prada
 * Copyright (C) 2021 ownCloud GmbH.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.owncloud.android.testutil

import android.accounts.Account

const val OC_ACCOUNT_ID = "username"
const val OC_ACCOUNT_NAME = "$OC_ACCOUNT_ID@demo.owncloud.com"

/**
 * Accounts
 */
val OC_ACCOUNT = Account(OC_ACCOUNT_NAME, "owncloud")

/**
 * BasicCredentials
 */
const val OC_BASIC_USERNAME = "user"
const val OC_BASIC_PASSWORD = "password"

/**
 * OAuth
 */
const val OC_OAUTH_SUPPORTED_TRUE = "TRUE"
const val OC_AUTH_TOKEN_TYPE = "owncloud.oauth2.access_token"
const val OC_ACCESS_TOKEN = "Asqweh12p93yehd10eu"
const val OC_REFRESH_TOKEN = "P3sd19DSsjdp1jwdd1"
const val OC_SCOPE = "email"

const val OC_TOKEN_ENDPOINT = "https://ocis.owncloud.works/konnect/v1/token"
const val OC_CLIENT_AUTH = "cl13nt4uth"
