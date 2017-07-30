package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1810 {

    @Ignore    private SampleClass1811 sampleClass;

    public SampleClass1810(){
        sampleClass = new SampleClass1811();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}