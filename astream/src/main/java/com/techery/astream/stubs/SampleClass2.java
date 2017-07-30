package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass2 {

    @Ignore    private SampleClass3 sampleClass;

    public SampleClass2(){
        sampleClass = new SampleClass3();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}