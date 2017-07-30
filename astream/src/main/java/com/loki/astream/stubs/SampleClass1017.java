package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1017 {

    @Ignore    private SampleClass1018 sampleClass;

    public SampleClass1017(){
        sampleClass = new SampleClass1018();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}