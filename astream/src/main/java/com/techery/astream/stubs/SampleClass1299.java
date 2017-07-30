package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1299 {

    @Ignore    private SampleClass1300 sampleClass;

    public SampleClass1299(){
        sampleClass = new SampleClass1300();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}