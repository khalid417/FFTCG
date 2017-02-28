/*
 * Copyright (C) 2017 khalid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.uberhaxed.fftcg.datamodel.card;

import java.util.List;
import net.uberhaxed.fftcg.datamodel.card.meta.CardType;
import net.uberhaxed.fftcg.datamodel.card.meta.Category;
import net.uberhaxed.fftcg.datamodel.card.meta.Element;
import net.uberhaxed.fftcg.datamodel.card.meta.Rarity;
import net.uberhaxed.fftcg.datamodel.card.meta.Set;

/**
 *
 * @author khalid
 */
public class Card {
	public String name;
	public CardType type;
	public Element element;
	public int cost;
	public List<Category> categories;
	public String text;
	public Set set;
	public Rarity rarity;
	public String id;
}
