package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass985 {

    @Ignore    private SampleClass986 sampleClass;

    public SampleClass985(){
        sampleClass = new SampleClass986();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}