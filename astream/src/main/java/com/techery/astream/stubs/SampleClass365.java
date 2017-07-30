package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass365 {

    @Ignore    private SampleClass366 sampleClass;

    public SampleClass365(){
        sampleClass = new SampleClass366();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}