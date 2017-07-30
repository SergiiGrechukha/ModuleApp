package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1305 {

    @Ignore    private SampleClass1306 sampleClass;

    public SampleClass1305(){
        sampleClass = new SampleClass1306();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}