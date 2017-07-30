package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass305 {

    @Ignore    private SampleClass306 sampleClass;

    public SampleClass305(){
        sampleClass = new SampleClass306();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}