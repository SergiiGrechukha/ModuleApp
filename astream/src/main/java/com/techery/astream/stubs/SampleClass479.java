package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass479 {

    @Ignore    private SampleClass480 sampleClass;

    public SampleClass479(){
        sampleClass = new SampleClass480();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}