package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1300 {

    @Ignore    private SampleClass1301 sampleClass;

    public SampleClass1300(){
        sampleClass = new SampleClass1301();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}