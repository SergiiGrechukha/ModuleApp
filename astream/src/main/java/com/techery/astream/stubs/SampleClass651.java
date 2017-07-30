package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass651 {

    @Ignore    private SampleClass652 sampleClass;

    public SampleClass651(){
        sampleClass = new SampleClass652();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}