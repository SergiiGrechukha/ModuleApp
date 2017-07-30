package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1390 {

    @Ignore    private SampleClass1391 sampleClass;

    public SampleClass1390(){
        sampleClass = new SampleClass1391();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}