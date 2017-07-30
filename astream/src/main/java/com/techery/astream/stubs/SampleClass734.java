package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass734 {

    @Ignore    private SampleClass735 sampleClass;

    public SampleClass734(){
        sampleClass = new SampleClass735();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}