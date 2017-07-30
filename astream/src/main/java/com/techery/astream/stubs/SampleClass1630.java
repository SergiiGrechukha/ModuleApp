package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1630 {

    @Ignore    private SampleClass1631 sampleClass;

    public SampleClass1630(){
        sampleClass = new SampleClass1631();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}