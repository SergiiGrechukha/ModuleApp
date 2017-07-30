package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass69 {

    @Ignore    private SampleClass70 sampleClass;

    public SampleClass69(){
        sampleClass = new SampleClass70();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}