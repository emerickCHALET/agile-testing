package test;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import codingfactory.rpgconsole.enemy.Enemy;
import codingfactory.rpgconsole.hero.Hero;

public class EnemyTest {

	Enemy enemy;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Avant le démarrage");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Après tous les tests");
	}

	@Before
	public void setUp() throws Exception {
		enemy = new Enemy("Arthas Menethil", 5);
		System.out.println("Avant un test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Après un test");
	}

	@Test
	public void testHeroProperties() throws Exception {
		assertThat(enemy, hasProperty("name"));
        assertThat(enemy, hasProperty("name", is("Arthas Menethil")));
        assertThat(enemy, hasProperty("hp"));
        assertThat(enemy, hasProperty("hp", is(15 * 5)));
	}

    @Test
	public void testTakeDamage() throws Exception {
        assertThat(enemy, hasProperty("hp"));
        assertThat(enemy, hasProperty("hp", is(15 * 5)));
        enemy.takeDamage(5);
        assertThat(enemy, hasProperty("hp"));
        assertThat(enemy, hasProperty("hp", is(15 * 5 - 5)));
	}

    @Test
	public void testAttack() throws Exception {
        Hero hero = new Hero("Jaina Portvaillant");
        assertThat(hero, hasProperty("hp"));
        assertThat(hero, hasProperty("hp", is(20)));
        double res = hero.getHp();
        enemy.attack(hero);
        assertThat((double)hero.getHp(), is(closeTo(res - 5, res - 11)));
	}

}
