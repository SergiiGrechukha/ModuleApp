package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass923 {

    @Ignore    private SampleClass924 sampleClass;

    public SampleClass923(){
        sampleClass = new SampleClass924();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}