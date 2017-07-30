package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1015 {

    @Ignore    private SampleClass1016 sampleClass;

    public SampleClass1015(){
        sampleClass = new SampleClass1016();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}