package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1119 {

    @Ignore    private SampleClass1120 sampleClass;

    public SampleClass1119(){
        sampleClass = new SampleClass1120();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}