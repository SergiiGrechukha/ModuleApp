package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass5 {

    @Ignore    private SampleClass6 sampleClass;

    public SampleClass5(){
        sampleClass = new SampleClass6();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}