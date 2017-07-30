package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass207 {

    @Ignore    private SampleClass208 sampleClass;

    public SampleClass207(){
        sampleClass = new SampleClass208();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}