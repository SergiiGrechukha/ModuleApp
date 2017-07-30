package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1385 {

    @Ignore    private SampleClass1386 sampleClass;

    public SampleClass1385(){
        sampleClass = new SampleClass1386();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}