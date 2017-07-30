package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1538 {

    @Ignore    private SampleClass1539 sampleClass;

    public SampleClass1538(){
        sampleClass = new SampleClass1539();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}