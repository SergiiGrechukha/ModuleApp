package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass690 {

    @Ignore    private SampleClass691 sampleClass;

    public SampleClass690(){
        sampleClass = new SampleClass691();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}