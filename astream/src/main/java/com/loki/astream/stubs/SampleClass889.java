package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass889 {

    @Ignore    private SampleClass890 sampleClass;

    public SampleClass889(){
        sampleClass = new SampleClass890();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}