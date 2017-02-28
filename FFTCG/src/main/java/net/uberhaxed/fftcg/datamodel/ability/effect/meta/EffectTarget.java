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
package net.uberhaxed.fftcg.datamodel.ability.effect.meta;

import net.uberhaxed.fftcg.datamodel.ability.State;
import net.uberhaxed.fftcg.datamodel.ability.TargetPlayer;
import net.uberhaxed.fftcg.datamodel.card.meta.CardType;
import net.uberhaxed.fftcg.datamodel.card.meta.Element;

/**
 *
 * @author khalid
 */
public class EffectTarget{
	public CardType targetType;
	public State targetState;
	public String targetJob;
	public Element targetElement;
	public TargetPlayer targetPlayer;
	public int costLimitUpper;
	public int costLimitLower;
	public int powerLimitUpper;
	public int powerLimitLower;
	public String name;
	public boolean damaged;
}
