package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass235 {

    @Ignore    private SampleClass236 sampleClass;

    public SampleClass235(){
        sampleClass = new SampleClass236();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}