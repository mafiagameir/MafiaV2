/*
 *     Copyright (c) 2018 Isa Hekmatizadeh.
 *     This file is part of mafiagame.
 *
 *     Mafiagame is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Mafiagame is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Mafiagame.  If not, see <http://www.gnu.org/licenses/>.
 */

package co.mafiagame.bot.telegram;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Esa Hekmatizadeh
 */
public class SendMessageWithRemoveKeyboard extends SendMessage {
	@JsonProperty("reply_markup")
	private TReplyKeyboardRemove replyMarkup = new TReplyKeyboardRemove();

	public TReplyKeyboardRemove getReplyMarkup() {
		return replyMarkup;
	}

	public SendMessageWithRemoveKeyboard setReplyMarkup(TReplyKeyboardRemove replyMarkup) {
		this.replyMarkup = replyMarkup;
		return this;
	}
}
