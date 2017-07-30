package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1912 {

    @Ignore    private SampleClass1913 sampleClass;

    public SampleClass1912(){
        sampleClass = new SampleClass1913();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}