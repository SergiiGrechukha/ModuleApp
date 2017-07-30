package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1147 {

    @Ignore    private SampleClass1148 sampleClass;

    public SampleClass1147(){
        sampleClass = new SampleClass1148();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}