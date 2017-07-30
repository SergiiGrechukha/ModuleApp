package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass874 {

    @Ignore    private SampleClass875 sampleClass;

    public SampleClass874(){
        sampleClass = new SampleClass875();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}