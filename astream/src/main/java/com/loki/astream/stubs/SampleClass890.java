package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass890 {

    @Ignore    private SampleClass891 sampleClass;

    public SampleClass890(){
        sampleClass = new SampleClass891();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}