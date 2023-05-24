package otus;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.Locale;


public abstract class NumberToStringConverter {
    protected abstract String getCurrency(int sumToConvertToTxt);

    public String convertNumToStr(int i) {
        RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"),
                RuleBasedNumberFormat.SPELLOUT);
        return nf.format(i) + getCurrency(i);
    }
}
