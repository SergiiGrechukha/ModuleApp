package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass132 {

    @Ignore    private SampleClass133 sampleClass;

    public SampleClass132(){
        sampleClass = new SampleClass133();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}