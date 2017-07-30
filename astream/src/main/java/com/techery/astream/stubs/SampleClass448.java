package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass448 {

    @Ignore    private SampleClass449 sampleClass;

    public SampleClass448(){
        sampleClass = new SampleClass449();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}