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
package net.uberhaxed.fftcg.datamodel.ability;

import java.util.List;
import net.uberhaxed.fftcg.datamodel.ability.meta.AbilityType;
import net.uberhaxed.fftcg.datamodel.ability.meta.Cost;
import net.uberhaxed.fftcg.datamodel.ability.meta.Precondition;
import net.uberhaxed.fftcg.datamodel.ability.effect.meta.Effect;

/**
 *
 * @author khalid
 */
public class Ability {
	public AbilityType abilityType;
	public Cost cost;
	public List<Precondition> precondition;
	public List<Effect> effects;
}
