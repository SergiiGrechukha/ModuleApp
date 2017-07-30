package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass427 {

    @Ignore    private SampleClass428 sampleClass;

    public SampleClass427(){
        sampleClass = new SampleClass428();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}