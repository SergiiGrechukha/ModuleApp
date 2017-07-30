package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1923 {

    @Ignore    private SampleClass1924 sampleClass;

    public SampleClass1923(){
        sampleClass = new SampleClass1924();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}