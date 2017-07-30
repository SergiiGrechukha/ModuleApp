package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1677 {

    @Ignore    private SampleClass1678 sampleClass;

    public SampleClass1677(){
        sampleClass = new SampleClass1678();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}