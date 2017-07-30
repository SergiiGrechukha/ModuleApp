package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1038 {

    @Ignore    private SampleClass1039 sampleClass;

    public SampleClass1038(){
        sampleClass = new SampleClass1039();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}