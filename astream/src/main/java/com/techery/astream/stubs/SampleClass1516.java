package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1516 {

    @Ignore    private SampleClass1517 sampleClass;

    public SampleClass1516(){
        sampleClass = new SampleClass1517();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}