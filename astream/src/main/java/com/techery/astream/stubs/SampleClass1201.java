package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1201 {

    @Ignore    private SampleClass1202 sampleClass;

    public SampleClass1201(){
        sampleClass = new SampleClass1202();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}