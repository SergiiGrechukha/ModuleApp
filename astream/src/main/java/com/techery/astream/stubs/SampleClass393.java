package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass393 {

    @Ignore    private SampleClass394 sampleClass;

    public SampleClass393(){
        sampleClass = new SampleClass394();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}