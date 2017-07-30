package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1257 {

    @Ignore    private SampleClass1258 sampleClass;

    public SampleClass1257(){
        sampleClass = new SampleClass1258();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}