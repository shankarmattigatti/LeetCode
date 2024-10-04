/**
 * 2491. Divide Players Into Teams of Equal Skill
 * @param {number[]} skill
 * @return {number}
 */
const dividePlayers = function (skill) {
  skill.sort((a, b) => a - b);
  let i = 0, j = skill.length - 1;
  let strength = skill[i] + skill[j];
  let totalStength = skill[i++] * skill[j--];
  while (i < j) {
    let currentStength = skill[i] + skill[j];
    if (currentStength !== strength)
      return -1;

    totalStength += skill[i++] * skill[j--];
  }
  return totalStength;
};