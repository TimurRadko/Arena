# Arena

Fighting arena

Итак, по поводу задач на наследование. Берём код арены, написанный на прошлом занятии и дописываем его. Я его вам сброшу сегодня, можете просто скопировать или, что круче, напишите его с нуля по примеру, а дальше выполняем задания
1. Создаём наследника Warrior, абстрактный класс Magician(волшебник), у которого есть поля mana и cooldown(перезарядка) и magicAttack(атака магией)
2. Наследуем от волшебника класс FireMage(огненный маг). Показатель атаки у нового класса 3, hp 120
3. У огненного мага показатель магической атаки 95, cooldown 0, маны 20
Правила атаки мага:
   Наносит 1 раз полный урон от своей магической атаки и теряет 4 маны, после чего cooldown становится равен 3, до тех пор пока cooldown не станет равен 0, маг будет вынужден атаковать обычной атакой, то есть в следующий раз он вызовет на оппоненте takeDamage передав туда свой показатель обычной атаки(attack) и уменьшит cooldown на 1. Естественно, также магическая атака невозможна если у мага не хватает маны.
4. Протестируйте нового мага в бое с гладиатором.
5. Если хватит сил и интереса, напишите ещё какого-нибудь нового мага, какого придумаете
