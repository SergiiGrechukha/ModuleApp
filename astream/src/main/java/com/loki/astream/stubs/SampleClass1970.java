package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1970 {

    @Ignore    private SampleClass1971 sampleClass;

    public SampleClass1970(){
        sampleClass = new SampleClass1971();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}