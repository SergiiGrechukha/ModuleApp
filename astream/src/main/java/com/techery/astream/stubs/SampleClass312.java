package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass312 {

    @Ignore    private SampleClass313 sampleClass;

    public SampleClass312(){
        sampleClass = new SampleClass313();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}