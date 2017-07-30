package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1507 {

    @Ignore    private SampleClass1508 sampleClass;

    public SampleClass1507(){
        sampleClass = new SampleClass1508();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}