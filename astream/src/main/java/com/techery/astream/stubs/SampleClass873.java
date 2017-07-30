package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass873 {

    @Ignore    private SampleClass874 sampleClass;

    public SampleClass873(){
        sampleClass = new SampleClass874();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}